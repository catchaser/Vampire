package com.massivecraft.vampire.cmd;

import org.bukkit.entity.Player;

import com.massivecraft.mcore3.cmd.req.ReqHasPerm;
import com.massivecraft.mcore3.util.MUtil;
import com.massivecraft.vampire.*;

public class CmdSetHealth extends CmdSetAbstract<Integer>
{
	public CmdSetHealth()
	{
		targetMustBeOnline = true;
		classOfT = Integer.class;
		this.addAliases("h");
		this.addRequirements(ReqHasPerm.get(Permission.SET_HEALTH.node));
	}

	@Override
	public Integer set(VPlayer vplayer, Player player, Integer val)
	{
		Integer res = MUtil.limitNumber(val, 0, 20);
		player.setHealth(res);
		return res;
	}
}
