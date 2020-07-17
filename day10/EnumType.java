package pkg10;

public class EnumType {

	
	/**
	 * 
	 * 	Enum type (Symbolic Constants)
	 * 
	 * Shoose ->> walking, running, tracking, hiking
	 *
	 *public enum EnumType{
	 *
	 *}
	 *
	 */
	public enum ShoseType {
		  WALKING,
		  RUNNING,
		  TRACKING,
		  HIKING
		}
	
	
	
	public static void main(String[] args) {
		ShoseType myShose = ShoseType.WALKING;
		System.out.println(myShose);
		
	}
}
	