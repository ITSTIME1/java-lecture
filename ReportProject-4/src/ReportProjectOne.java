// default 클래스
// 동일패키지에 있다면 접근이 가능.
class Song {
	// private 외부 내부 상관없이 getter 또는 setter를 통해서 간접적으로 접근가능.
	private String title;
	
	// this 키워드를 통해서 클래스 내부의 멤버변수를 가르킴. 이유는 파라미터이름과 혼동이 있을 수 있기 때문이다.
	public Song(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
} 


public class ReportProjectOne {

	public static void main(String[] args) {
		// mySong은 레퍼런스 객체를 가리키고 있는 변수이면서 Song("Nessun Dorma") 가리키고 있다.
		// yourSong 또한 마찬가지로 Song("공주는 잠 못 이루고")를 가리키고 있다.
		Song mySong = new Song("Nessun Dorma");
		Song yourSong = new Song("공주는 잠 못 이루고");
		
		// getter 메소드를 통해서 각자의 객체의 저장되어 있는 title 값을 가지고온다.
		System.out.println("내 노래는 " + mySong.getTitle());
		System.out.println("너 노래는 " + yourSong.getTitle());
		

	}

}
