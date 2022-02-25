package com.corejavab9;
import java.io.*;
public class SingleTon {



	private static SingleTon instance;

	private  SingleTon() {}
	public  String str;
	public static SingleTon getSingleinstance()
	{
		if(instance==null)
		{
		instance=new SingleTon();
	}
	return instance;
	}
}


