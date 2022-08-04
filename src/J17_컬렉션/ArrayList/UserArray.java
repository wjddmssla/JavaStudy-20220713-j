package J17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Data;
import lombok.Getter;

@Getter
@Data

public class UserArray {
	private List<User> userList;
	private Scanner scanner;
	
	public UserArray() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	
	public void addUser() {
		String username=null;
		String password=null;
		String name=null;
		String email=null;
		
		System.out.print("아이디: ");
		username=scanner.nextLine();
		System.out.print("비밀번호: ");
		password=scanner.nextLine();
		System.out.print("이름: ");
		name=scanner.nextLine();
		System.out.print("이메일");
		email=scanner.nextLine();
		
		User user=User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
		
		userList.add(user);
	}
	
	public void printUserList() {
		for(User user: userList) {
			System.out.println("아이디\t> " + user.getUsername());
			System.out.println("비밀번호> " + user.getPassword());
			System.out.println("이름\t> " + user.getName());
			System.out.println("이메일\t> " +  user.getEmail());
		}
		
	}
	
	public void removeUserList() {
		String username=null;
		String password=null;
		
		System.out.print("아이디: ");
		username=scanner.nextLine();
		
		for(User user: userList) {
			if(user.getUsername().equals(username)) {
				System.out.print("비밀번호sss:");
				password=scanner.nextLine();
				
				if(user.getPassword().equals(password)) {
					userList.remove(user);
					System.out.print("삭제완료");
					return;
					
				}else {
					System.out.println("비밀번호가 일치하지 않는다.");
					return;
				}
			}
		}
		System.out.println("해당아이디는 존재하지 않는다.");
		
	}
	
	public static void main(String[] args) {
		UserArrayList userArrayList = new UserArrayList();
		
		while(true) {
			String select = null;
			
			System.out.println("<사용자관리 프로그램>");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 정보 출력");
			System.out.println("3. 사용자 정보 제거");
			System.out.println("4. 프로그램 종료");
			System.out.print("메뉴 선택 >> ");
			
			select = userArrayList.getScanner().nextLine();
			
			if(select.equals("1")) {
				userArrayList.addUser();
			}else if(select.equals("2")) {
				userArrayList.printUserList();
			}else if(select.equals("3")) {
				userArrayList.removeUser();
			}else if(select.equals("4")) {
				System.out.println("포그로매 종료");
				break;
			}else {
				System.out.println("해당 정보는 사용 불가");
			}
			
		}

	}

}
	






	


	
	
	
	
	
	
	
	
	
	
	
	



