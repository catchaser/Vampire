package com.massivecraft.vampire.cmd;

import com.massivecraft.mcore3.cmd.req.ReqHasPerm;
import com.massivecraft.vampire.*;

public class CmdModeIntend extends CmdModeAbstract
{	
	public CmdModeIntend()
	{
		this.addAliases("i", "intend");
		this.addRequirements(new ReqHasPerm(Permission.MODE_INTENT.node));
	}
	
	protected void set(boolean val)
	{
		vme.intend(val);
	}
	
	protected boolean get()
	{
		return vme.intend();
	}
}
