package br.com.maa.model;

import br.com.maa.helpers.StringOps;

public interface Effect
{
	default public String getName()
	{
		return StringOps.convertName(this.getClass().getSimpleName());
	}
	
	default public String getTooltip()
	{
		return "no tooltip";
	}
	
	public EffectType getEffectType();
}
