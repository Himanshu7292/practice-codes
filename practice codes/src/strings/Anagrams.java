package strings;

public class Anagrams {

	public static void main(String[] args) {
		String a= "silent";
		String b= "listen";
		boolean isanagram=false;
		boolean[] visited=new boolean[b.length()];
		if(a.length()==b.length()) {
		for (int i = 0; i < a.length(); i++) {
			char c =a.charAt(i);
			 isanagram=false;
			for (int j = 0; j < b.length(); j++) {
				if(b.charAt(j)==c && !visited[j]) {
					visited[j]=true;
					isanagram=true;
					
					break;
						}
			}
			if(!isanagram) {
				break;
			}
		}
		}
		if(isanagram) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
	}

}
