package br.com.maa.effects.passive;

import br.com.maa.model.PassiveEffect;

public class AutoTargetingInterface implements PassiveEffect
{
	public static final PassiveEffect instance = new AutoTargetingInterface();
	
	
	public String getName()
	{
		return "Auto-Targeting Interface";
	}
	
	public String getTooltip()
	{
		return "Chance for attacks to have 100% chance to hit and crit and gain True Strike";
	}

}
