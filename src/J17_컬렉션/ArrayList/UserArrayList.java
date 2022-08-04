package J17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import lombok.Data;
import lombok.Getter;

@Getter
@Data

public class UserArrayList {
	private List<User> userList;
	private Scanner scanner;
	
	//생성자 호출시에 객체 생성 
	public UserArrayList() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	
	public void addUser() {
		String username=null;
		String password=null;
		String name=null;
		String email=null;
		//입력
		System.out.print("아이디: ");
		username=scanner.nextLine();
		System.out.print("비밀번호: ");
		password=scanner.nextLine();
		System.out.print("이름: ");
		name=scanner.nextLine();
		System.out.print("이메일: ");
		email=scanner.nextLine();
		
		//User 객체 생성
		User user = User.builder()
		.username(username)
		.password(password)
		.name(name)
		.email(email)
		.build();
		
		//userList에 add하기
		userList.add(user);
//		User user1 = new User("aaa", "1234", "김준일", "aaa@naver.com");
//		User user2 = new User("bbb", "2222", "김준이", "bbb@naver.com");
//		
//		ArrayList<User> UserArrayList = new ArrayList<User>();
//		User[] users = {user1, user2};
//		UserArrayList.addAll(Arrays.asList(users));
//		
//		System.out.println(UserArrayList);
		
		
		
	}
	
	public void printUserList() {
		//userList 반환
		/*
		 * 아이디	> aaa
		 * 비밀번호 > 1234
		 * 이름 	> 김준일
		 * 이메일	> aaa@naver.com
		 * 
		 * 아이디	> bbb
		 * 비밀번호 > 2222
		 * 이름		> 김준이
		 * 이메일 	> bbb@naver.com
		 * 
		 */
		
		for(User user: userList) {
			System.out.println("아이디\t> " + user.getUsername());
			System.out.println("비밀번호> " + user.getPassword());
			System.out.println("이름\t> " + user.getName());
			System.out.println("이메일\t> " + user.getEmail());
			System.out.println();
			
		}
	}
	
	public void removeUser() {
		//아이디 입력
		String username= null;
		String password=null;
		
		System.out.print("아이디: ");
		username=scanner.nextLine();
		
		for(User user: userList) {
			if(user.getUsername().equals(username)) {
				System.out.print("비밀번호: ");
				password=scanner.nextLine();
				
				if(user.getPassword().equals(password)) {
					userList.remove(user);
					System.out.println(user);
					System.out.println("삭제 완료");
					return;
				}else {
					System.out.println("비밀번호가 일치하지 않음");
					return;
				}
			}
		}
		System.out.println("해당아이디는 존재하지 않는다.");
		
//		for (int i = 0; i < userList.size(); i++) {
//			Object username;
//			if (username.equals(userList.get(i).getName())) {
//				userList.remove(i);
		
//				System.out.println("삭제되었습니다!");
//			} else {
//				System.out.println("회원이 존재하지 않습니다.");
//			}
//			break;
		}

	public static void main(String[] args) {
		UserArrayList userArrayList = new UserArrayList();
		
		/*
		 * [ 사용자 관리 프로그램 ]
		 * 1. 사용자 추가
		 * 2. 사용자 리스트 출력 
		 * 3. 사용자 삭제
		 * 4. 프로그램 종료
		 */
		
		while(true) {
			String select = null;
			
			System.out.println("[사용자관리 프로그램]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 리스트 출력");
			System.out.println("3. 사용자 삭제");
			System.out.println("4. 프로그램 종료");
			System.out.print("메뉴 선택 > ");
			
			select = userArrayList.getScanner().nextLine();
			
			if(select.equals("1")) {
				userArrayList.addUser();
				
			}else if(select.equals("2")) {
				userArrayList.printUserList();
				
			}else if(select.equals("3")) {
				userArrayList.removeUser();
								
			}else if(select.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("해당 번호는 사용불가");
			}
			
		}
		
	}

}
