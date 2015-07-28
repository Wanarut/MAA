package br.com.maa.model;

/**
 * São os efeitos especiais (quick action, deadly crits, etc.)
 * @author vini
 *
 */
public interface SpecialEffect extends Effect
{
	default public EffectType getEffectType()
	{
		return EffectType.BUFF;
	}
}
