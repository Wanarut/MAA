package br.com.maa.effects.passive;

import br.com.maa.model.PassiveEffect;

public class Flying implements PassiveEffect
{
	public static final PassiveEffect instance = new Flying();
	
	public String getTooltip()
	{
		return "Immune to ground attacks";
	}
}
