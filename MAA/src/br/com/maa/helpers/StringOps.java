package br.com.maa.helpers;

import br.com.maa.effects.buff.UnibeamFocus;


public class StringOps
{
	public static void main(String[] args)
	{
		System.out.println(UnibeamFocus.instance.getName());
	}
	
	public static String convertName(final String theName)
	{
		final StringBuilder sBuilder = new StringBuilder();
		
		int prevPos = 0;
		int nextPos = nextUpperCase(theName, prevPos);
		
		while (nextPos < theName.length())
		{
			sBuilder.append(theName.substring(prevPos, nextPos));
			sBuilder.append(" ");
			prevPos = nextPos;
			nextPos = nextUpperCase(theName, prevPos + 1);
		}
		
		sBuilder.append(theName.substring(prevPos, nextPos));
		
		return sBuilder.toString();
	}
	
	private static int nextUpperCase(final String inString, final int start)
	{
		for (int i = start; i < inString.length(); i++)
		{
			if (Character.isUpperCase(inString.charAt(i)))
			{
				return i;
			}
		}
		return inString.length();
	}

}
