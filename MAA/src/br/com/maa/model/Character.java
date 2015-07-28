package br.com.maa.model;

import java.util.List;

import br.com.maa.helpers.StringOps;

public interface Character
{
	default public String getName()
	{
		return StringOps.convertName(this.getClass().getSimpleName());
	}
	
	/**
	 * Representam os efeitos passivos do personagem
	 * @return
	 */
	public List<PassiveEffect> getEffects();
	
	/**
	 * Retorna o gênero do personagem
	 * @return
	 */
	public Gender getGender();
	
	/**
	 * Retorna se esse personagem carrega metal
	 * @return
	 */
	public boolean carriesMetal();
	
	/**
	 * Retorna a lista de ataques deste personagem
	 * @return
	 */
	public List<Attack> getAttacks();

}
