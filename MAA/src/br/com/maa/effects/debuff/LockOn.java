package br.com.maa.effects.debuff;

import br.com.maa.effects.DebuffEffect;
import br.com.maa.model.Effect;

public class LockOn implements DebuffEffect
{
	public static final Effect instance = new LockOn();

	@Override
	public String getName()
	{
		return "Lock-On";
	}

	@Override
	public String getTooltip()
	{
		return "Taking additional damage from ranged attacks";
	}

	@Override
	public Integer getDuration()
	{
		return 3;
	}

}
