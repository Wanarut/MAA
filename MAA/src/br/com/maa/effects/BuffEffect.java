package br.com.maa.effects;

import br.com.maa.model.Effect;
import br.com.maa.model.EffectType;

/**
 * São os efeitos mais comuns
 * @author vini
 *
 */
public interface BuffEffect extends Effect
{
	public Integer getDuration();
	
	default public EffectType getEffectType()
	{
		return EffectType.BUFF;
	}
}
