package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dao.MemoDao;
import test.dto.MemberDto;
import test.dto.MemoDto;

/*
 * 	create table memo
 * 	(num number primary key,
 * 	content varchar2(30),
 * 	regdate DATE);
 * 
 * 	create sequence MEMO_SEQ;
 * 
 * 	위와 같이 테이블과 시퀀스를 만들고 해당 테이블에 데이터를 
 * 	select, insert, update, delete 기능을 수행할 수 있는 MemoFrame을 만들어 보세요
 * 
 * 	조건
 * 	1. num 칼럼의 값은 시퀀스를 이용해서 넣으세요
 * 	2. regdate 칼럼(등록일)의 값은 sysdate 를 이용해서 넣으세요
 * 	3. 수정은 content만 수정 가능하게 하세요.
 * 	4. MemoDto, MemoDao를 만들어서 프로그래밍 하세요. 
 */
public class MemoFrame extends JFrame implements ActionListener, PropertyChangeListener {

	JTextField msg;
	DefaultTableModel model;
	JTable table;

	public MemoFrame() {

		String[] colNames = { "번호", "내용", "날짜" };

		setLayout(new BorderLayout());

		JPanel panel = new JPanel();

		JLabel label = new JLabel("내용");
		msg = new JTextField(10);
		
		JButton selectBtn = new JButton("찾기");
		JButton addBtn = new JButton("추가");
		JButton removeBtn = new JButton("삭제");

		panel.add(label);
		panel.add(msg);
		panel.add(selectBtn);
		panel.add(addBtn);
		panel.add(removeBtn);
		panel.setBackground(Color.yellow);

		add(panel, BorderLayout.NORTH);

		table = new JTable();
		model = new DefaultTableModel(colNames, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				if (column == 0 || column == 2) {
					return false;
				}
				return true;
			}

		};
		selectBtn.addActionListener(this);
		addBtn.addActionListener(this);
		removeBtn.addActionListener(this);

		selectBtn.setActionCommand("select");
		addBtn.setActionCommand("add");
		removeBtn.setActionCommand("remove");

		table.setModel(model);

		displayMemo();

		JScrollPane scroll = new JScrollPane(table);
		// JScrollPane 을 프레임의 가운데에 배치하기
		add(scroll, BorderLayout.CENTER);

		table.addPropertyChangeListener(this);
	}

	public void displayMemo() {
		List<MemoDto> list2 = MemoDao.getInstance().getlist();

		model.setRowCount(0);
		for (MemoDto tmp : list2) {
			Object[] obj = { tmp.getNum(), tmp.getContent(), tmp.getRegDate() };
			model.addRow(obj);
		}
	}

	public static void main(String[] args) {
		MemoFrame f = new MemoFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("add")) {
			String content = msg.getText();
			MemoDto dto = new MemoDto();
			dto.setContent(content);

			MemoDao.getInstance().insert(dto);

			displayMemo();

		} else if (e.getActionCommand().equals("remove")) {
			int number = table.getSelectedRow();

			List<MemoDto> list = MemoDao.getInstance().getlist();

			MemoDao.getInstance().delete(list.get(number).getNum());

			displayMemo();
		} else if(e.getActionCommand().equals("select")) {
			String content = msg.getText();
			
			MemoDto dto = new MemoDto();
			dto.setContent(content);
			
			List<MemoDto> result = MemoDao.getInstance().select(dto);
			
			model.setRowCount(0);
			for(MemoDto tmp:result) {
				Object[] row = {tmp.getNum(), tmp.getContent(), tmp.getRegDate()};
				model.addRow(row);
			}
		}
	}

	// 현재 테이블 cell을 수정중인지 여부를 저장할 필드
	boolean isEditing = false;

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getPropertyName().equals("tableCellEditor")) {
			if (isEditing) {// 수정중일때
				// 변화된 값을 읽어와서 DB 에 반영한다.
				// 수정된 칼럼에 있는 row 전체의 값을 읽어온다.
				int selectedIndex = table.getSelectedRow();
				int num = (int) model.getValueAt(selectedIndex, 0);
				String content = (String) model.getValueAt(selectedIndex, 1);

				// 수정할 회원의 정보를 MemberDto 객체에 담고
				MemoDto dto = new MemoDto();
				dto.setNum(num);
				dto.setContent(content);
				// DB에 저장하기
				MemoDao.getInstance().update(dto);
				isEditing = false;// 수정중이 아니라고 표시한다.
			}
			isEditing = true;// 수정중이라 표시한다.
		}

	}

}
