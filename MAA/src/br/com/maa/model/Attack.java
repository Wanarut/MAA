package br.com.maa.model;

import java.util.List;

import br.com.maa.helpers.StringOps;

public interface Attack
{
	default public String getName()
	{
		return StringOps.convertName(this.getClass().getSimpleName());
	}
	
	public Integer getStaminaCost();
	public TargetType getTarget();
	public Integer getCooldown();
	public Integer getNumberHits();
	public Integer getHitChance();
	public Integer getCriticalChance();
	
	/**
	 * Os tipos associados ao ataque
	 * @return
	 */
	public List<AttackType> getAttackType();
	
	/**
	 * Os efeitos que o ataque causa
	 * @return
	 */
	public List<Effect> getEffects();
}
