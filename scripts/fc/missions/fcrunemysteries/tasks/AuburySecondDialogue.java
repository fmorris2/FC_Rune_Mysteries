package scripts.fc.missions.fcrunemysteries.tasks;

import scripts.fc.api.items.FCItem;
import scripts.fc.missions.fcrunemysteries.data.RMSettings;

public class AuburySecondDialogue extends AuburyDialogue
{
	private static final long serialVersionUID = -3371537594388996828L;

	@Override
	public FCItem[] getRequiredItems()
	{
		return new FCItem[] {};
	}

	@Override
	public boolean shouldExecute()
	{
		return RMSettings.AUBURY_SECOND_DIALOGUE.isValid();
	}

	@Override
	public String getStatus()
	{
		return "Aubury second dialogue";
	}

}
