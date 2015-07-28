package br.com.maa.effects.passive;

import br.com.maa.model.PassiveEffect;

public class RevengerTactics implements PassiveEffect
{
	public static final PassiveEffect instance = new RevengerTactics();
	
	public String getTooltip()
	{
		return "Places Marked for Revenge when attacked, increasing damage done";
	}
}
