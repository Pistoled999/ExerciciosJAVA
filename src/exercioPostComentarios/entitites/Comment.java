package exercioPostComentarios.entitites;

public class Comment {
	private String name;
	
	public Comment () {
		
	}

	public Comment(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Comment [name=" + name + "]";
	}

	
}
