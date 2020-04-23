package LabAssignment6_3;

public class MirrorImage {
	public String createMirror(String s)
	{
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String mirrorImage=s+" | "+sb;
		return mirrorImage;
	}

}
