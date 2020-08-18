package milu.kiriu2010.exmaven01;

import com.google.gson.Gson;

// https://web.plus-idea.net/2016/08/eclipse-%E3%81%AEmarven%E3%83%97%E3%83%AD%E3%82%B8%E3%82%A7%E3%82%AF%E3%83%88%E4%BD%9C%E6%88%90%E6%99%82%E3%81%ABcould-not-resolve-artifact-archetypes%E3%81%AE%E3%82%A8%E3%83%A9%E3%83%BC%E3%81%8C/
public class App 
{
    public static void main( String[] args )
    {
    	Gson gson = new Gson();
        System.out.println(gson.toJson("Hello World!"));
    }
}
