package br.com.maa.model;

import br.com.maa.helpers.StringOps;

/**
 * Representa os efeitos passivos dos personagens
 * @author vini
 *
 */
public interface PassiveEffect
{
	default public String getName()
	{
		return StringOps.convertName(this.getClass().getSimpleName());
	}
	
	public String getTooltip();
}
