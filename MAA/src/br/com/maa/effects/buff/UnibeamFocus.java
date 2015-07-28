package br.com.maa.effects.buff;

import br.com.maa.effects.BuffEffect;
import br.com.maa.model.Effect;

public class UnibeamFocus implements BuffEffect
{
	public static final Effect instance = new UnibeamFocus();

	@Override
	public Integer getDuration()
	{
		return 1;
	}
}
