/**********************************************************************
 * This file is part of Adempiere ERP Bazaar                          *
 * http://www.adempiere.org                                           *
 *                                                                    *
 * Copyright (C) Trifon Trifonov.                                     *
 * Copyright (C) Contributors                                         *
 *                                                                    *
 * This program is free software;
 you can redistribute it and/or      *
 * modify it under the terms of the GNU General Public License        *
 * as published by the Free Software Foundation;
 either version 2     *
 * of the License, or (at your option) any later version.             *
 *                                                                    *
 * This program is distributed in the hope that it will be useful,    *
 * but WITHOUT ANY WARRANTY;
 without even the implied warranty of     *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the       *
 * GNU General Public License for more details.                       *
 *                                                                    *
 * You should have received a copy of the GNU General Public License  *
 * along with this program;
 if not, write to the Free Software        *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,         *
 * MA 02110-1301, USA.                                                *
 *                                                                    *
 * Contributors:                                                      *
 * - Trifon Trifonov (trifonnt@users.sourceforge.net)                 *
 *                                                                    *
 * Sponsors:                                                          *
 * - Company (http://www.site.com)                                    *
 **********************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for AD_AlertProcessor
 *  @author Trifon Trifonov (generated) 
 *  @version Release 3.5.1a
 */
public interface I_AD_AlertProcessor 
{

    /** TableName=AD_AlertProcessor */
    public static final String Table_Name = "AD_AlertProcessor";

    /** AD_Table_ID=700 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AD_AlertProcessor_ID */
    public static final String COLUMNNAME_AD_AlertProcessor_ID = "AD_AlertProcessor_ID";

	/** Set Alert Processor.
	  * Alert Processor/Server Parameter
	  */
	public void setAD_AlertProcessor_ID (int AD_AlertProcessor_ID);

	/** Get Alert Processor.
	  * Alert Processor/Server Parameter
	  */
	public int getAD_AlertProcessor_ID();

    /** Column name DateLastRun */
    public static final String COLUMNNAME_DateLastRun = "DateLastRun";

	/** Set Date last run.
	  * Date the process was last run.
	  */
	public void setDateLastRun (Timestamp DateLastRun);

	/** Get Date last run.
	  * Date the process was last run.
	  */
	public Timestamp getDateLastRun();

    /** Column name DateNextRun */
    public static final String COLUMNNAME_DateNextRun = "DateNextRun";

	/** Set Date next run.
	  * Date the process will run next
	  */
	public void setDateNextRun (Timestamp DateNextRun);

	/** Get Date next run.
	  * Date the process will run next
	  */
	public Timestamp getDateNextRun();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name Frequency */
    public static final String COLUMNNAME_Frequency = "Frequency";

	/** Set Frequency.
	  * Frequency of events
	  */
	public void setFrequency (int Frequency);

	/** Get Frequency.
	  * Frequency of events
	  */
	public int getFrequency();

    /** Column name FrequencyType */
    public static final String COLUMNNAME_FrequencyType = "FrequencyType";

	/** Set Frequency Type.
	  * Frequency of event
	  */
	public void setFrequencyType (String FrequencyType);

	/** Get Frequency Type.
	  * Frequency of event
	  */
	public String getFrequencyType();

    /** Column name KeepLogDays */
    public static final String COLUMNNAME_KeepLogDays = "KeepLogDays";

	/** Set Days to keep Log.
	  * Number of days to keep the log entries
	  */
	public void setKeepLogDays (int KeepLogDays);

	/** Get Days to keep Log.
	  * Number of days to keep the log entries
	  */
	public int getKeepLogDays();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Processing */
    public static final String COLUMNNAME_Processing = "Processing";

	/** Set Process Now	  */
	public void setProcessing (boolean Processing);

	/** Get Process Now	  */
	public boolean isProcessing();

    /** Column name Supervisor_ID */
    public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";

	/** Set Supervisor.
	  * Supervisor for this user/organization - used for escalation and approval
	  */
	public void setSupervisor_ID (int Supervisor_ID);

	/** Get Supervisor.
	  * Supervisor for this user/organization - used for escalation and approval
	  */
	public int getSupervisor_ID();
}
