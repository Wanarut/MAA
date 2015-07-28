package br.com.maa.effects.debuff;

import br.com.maa.effects.DebuffEffect;
import br.com.maa.model.Effect;

public class Targeted implements DebuffEffect
{
	public static final Effect instance = new Targeted();

	@Override
	public Integer getDuration()
	{
		return 2;
	}

}
