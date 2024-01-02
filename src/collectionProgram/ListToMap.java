package collectionProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {
	private Integer studentId;
	private String studentname;
	public ListToMap(Integer studentId,String studentname)
	{
		this.studentId=studentId;
		this.studentname=studentname;
	}
	public Integer getid()
	{
		return studentId;
	}
	public String getname()
	{
		return studentname;
	}
	public static void main(String[] args) {
		List<ListToMap>l=new ArrayList<ListToMap>();
		l.add(new ListToMap(1,"Arun"));
		l.add(new ListToMap(2,"Satya"));
		Map<Integer,String> mp=new HashMap<>();
		for(ListToMap s:l)
		{
	mp.put(s.getid(), s.getname());
		}System.out.println(mp);
		
	}



}
