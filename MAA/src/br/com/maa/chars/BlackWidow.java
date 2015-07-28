package br.com.maa.chars;

import java.util.Arrays;
import java.util.List;

import br.com.maa.attacktype.Buff;
import br.com.maa.attacktype.Gun;
import br.com.maa.attacktype.Melee;
import br.com.maa.attacktype.Ranged;
import br.com.maa.attacktype.Unarmed;
import br.com.maa.effects.debuff.ComboSetup;
import br.com.maa.effects.debuff.Incapacitation;
import br.com.maa.effects.debuff.RemoveBuffs;
import br.com.maa.effects.debuff.Targeted;
import br.com.maa.effects.debuff.Weakened;
import br.com.maa.effects.passive.RevengerTactics;
import br.com.maa.effects.special.ExploitCombos;
import br.com.maa.effects.special.QuickAction;
import br.com.maa.effects.special.Subtle;
import br.com.maa.model.Attack;
import br.com.maa.model.AttackType;
import br.com.maa.model.Character;
import br.com.maa.model.Effect;
import br.com.maa.model.Gender;
import br.com.maa.model.PassiveEffect;
import br.com.maa.model.TargetType;


public class BlackWidow implements Character
{
	@Override
	public List<PassiveEffect> getEffects()
	{
		return Arrays.asList(RevengerTactics.instance);
	}

	@Override
	public Gender getGender()
	{
		return Gender.FEMALE;
	}

	@Override
	public boolean carriesMetal()
	{
		return false;
	}

	@Override
	public List<Attack> getAttacks()
	{
		return Arrays.asList(new MartialArtsCombo(), new WidowsBite(), new FlyingKick(), new Widowmaker());
	}

	
	private static final class MartialArtsCombo implements Attack
	{
		@Override
		public Integer getStaminaCost()
		{
			return 10;
		}

		@Override
		public TargetType getTarget()
		{
			return TargetType.ONE_ENEMY;
		}

		@Override
		public Integer getCooldown()
		{
			return 0;
		}

		@Override
		public Integer getNumberHits()
		{
			return 2;
		}

		@Override
		public Integer getHitChance()
		{
			return 92;
		}

		@Override
		public Integer getCriticalChance()
		{
			return 17;
		}

		@Override
		public List<AttackType> getAttackType()
		{
			return Arrays.asList(Unarmed.instance, Melee.instance);
		}

		@Override
		public List<Effect> getEffects()
		{
			return Arrays.asList(ExploitCombos.instance, ComboSetup.instance);
		}
	}
	
	private static final class WidowsBite implements Attack
	{
		@Override
		public String getName()
		{
			return "Widow's Bite";
		}

		@Override
		public Integer getStaminaCost()
		{
			return 20;
		}

		@Override
		public TargetType getTarget()
		{
			return TargetType.ONE_ENEMY;
		}

		@Override
		public Integer getCooldown()
		{
			return 0;
		}

		@Override
		public Integer getNumberHits()
		{
			return 1;
		}

		@Override
		public Integer getHitChance()
		{
			return 92;
		}

		@Override
		public Integer getCriticalChance()
		{
			return 17;
		}

		@Override
		public List<AttackType> getAttackType()
		{
			return Arrays.asList(Ranged.instance, Gun.instance);
		}

		@Override
		public List<Effect> getEffects()
		{
			return Arrays.asList(Weakened.instance, Incapacitation.instance);
		}
	}
	
	private static final class FlyingKick implements Attack
	{
		@Override
		public Integer getStaminaCost()
		{
			return 25;
		}

		@Override
		public TargetType getTarget()
		{
			return TargetType.ONE_ENEMY;
		}

		@Override
		public Integer getCooldown()
		{
			return 0;
		}

		@Override
		public Integer getNumberHits()
		{
			return 1;
		}

		@Override
		public Integer getHitChance()
		{
			return 84;
		}

		@Override
		public Integer getCriticalChance()
		{
			return 15;
		}

		@Override
		public List<AttackType> getAttackType()
		{
			return Arrays.asList(Unarmed.instance, Melee.instance);
		}

		@Override
		public List<Effect> getEffects()
		{
			return Arrays.asList(RemoveBuffs.instance);
		}
	}
	
	private static final class Widowmaker implements Attack
	{
		@Override
		public Integer getStaminaCost()
		{
			return 8;
		}

		@Override
		public TargetType getTarget()
		{
			return TargetType.ONE_ENEMY;
		}

		@Override
		public Integer getCooldown()
		{
			return 2;
		}

		@Override
		public Integer getNumberHits()
		{
			return 1;
		}

		@Override
		public Integer getHitChance()
		{
			return 100;
		}

		@Override
		public Integer getCriticalChance()
		{
			return -1;
		}

		@Override
		public List<AttackType> getAttackType()
		{
			return Arrays.asList(Buff.instance);
		}

		@Override
		public List<Effect> getEffects()
		{
			return Arrays.asList(QuickAction.instance, Subtle.instance, br.com.maa.effects.buff.Widowmaker.instance, Targeted.instance);
		}
	}
}
