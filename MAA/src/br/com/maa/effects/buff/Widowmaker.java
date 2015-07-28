package br.com.maa.effects.buff;

import br.com.maa.effects.BuffEffect;
import br.com.maa.model.Effect;

public class Widowmaker implements BuffEffect
{
	public static final Effect instance = new Widowmaker();

	@Override
	public Integer getDuration()
	{
		return 2;
	}
}
