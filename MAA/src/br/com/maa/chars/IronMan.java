package br.com.maa.chars;

import java.util.Arrays;
import java.util.List;

import br.com.maa.attacktype.Buff;
import br.com.maa.attacktype.Energy;
import br.com.maa.attacktype.Explosion;
import br.com.maa.attacktype.Ranged;
import br.com.maa.attacktype.Tech;
import br.com.maa.effects.debuff.Burning;
import br.com.maa.effects.debuff.LockOn;
import br.com.maa.effects.passive.AutoTargetingInterface;
import br.com.maa.effects.passive.Flying;
import br.com.maa.effects.special.DeadlyCrits;
import br.com.maa.effects.special.QuickAction;
import br.com.maa.model.Attack;
import br.com.maa.model.AttackType;
import br.com.maa.model.Character;
import br.com.maa.model.Effect;
import br.com.maa.model.Gender;
import br.com.maa.model.PassiveEffect;
import br.com.maa.model.TargetType;


public class IronMan implements Character
{

	@Override
	public List<PassiveEffect> getEffects()
	{
		return Arrays.asList(AutoTargetingInterface.instance, Flying.instance);
	}

	@Override
	public Gender getGender()
	{
		return Gender.MALE;
	}

	@Override
	public boolean carriesMetal()
	{
		return true;
	}

	@Override
	public List<Attack> getAttacks()
	{
		return Arrays.asList(new RepulsorRay(), new MissileBarrage(), new DeflectorShield(), new Unibeam());
	}

	
	private static final class RepulsorRay implements Attack
	{
		@Override
		public Integer getStaminaCost()
		{
			return 16;
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
			return 88;
		}

		@Override
		public Integer getCriticalChance()
		{
			return 11;
		}

		@Override
		public List<AttackType> getAttackType()
		{
			return Arrays.asList(Ranged.instance, Energy.instance, Tech.instance);
		}

		@Override
		public List<Effect> getEffects()
		{
			return Arrays.asList(LockOn.instance);
		}
	}
	
	private static final class MissileBarrage implements Attack
	{
		@Override
		public Integer getStaminaCost()
		{
			return 15;
		}

		@Override
		public TargetType getTarget()
		{
			return TargetType.ALL_ENEMIES;
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
			return 88;
		}

		@Override
		public Integer getCriticalChance()
		{
			return 11;
		}

		@Override
		public List<AttackType> getAttackType()
		{
			return Arrays.asList(Explosion.instance, Ranged.instance);
		}

		@Override
		public List<Effect> getEffects()
		{
			return Arrays.asList(Burning.instance);
		}
	}
	
	private static final class DeflectorShield implements Attack
	{
		@Override
		public Integer getStaminaCost()
		{
			return 27;
		}

		@Override
		public TargetType getTarget()
		{
			return TargetType.SELF;
		}

		@Override
		public Integer getCooldown()
		{
			return 2;
		}

		@Override
		public Integer getNumberHits()
		{
			return 0;
		}

		@Override
		public Integer getHitChance()
		{
			return -1;
		}

		@Override
		public Integer getCriticalChance()
		{
			return -1;
		}

		@Override
		public List<AttackType> getAttackType()
		{
			return Arrays.asList(Buff.instance, Tech.instance);
		}

		@Override
		public List<Effect> getEffects()
		{
			return Arrays.asList(QuickAction.instance, br.com.maa.effects.buff.DeflectorShield.instance);
		}
	}
	
	private static final class Unibeam implements Attack
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
			return 88;
		}

		@Override
		public Integer getCriticalChance()
		{
			return 11;
		}

		@Override
		public List<AttackType> getAttackType()
		{
			return Arrays.asList(Ranged.instance, Energy.instance, Tech.instance);
		}

		@Override
		public List<Effect> getEffects()
		{
			return Arrays.asList(DeadlyCrits.instance);
		}
	}
	
}
