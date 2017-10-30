package org.lldm.xaltipac.service;

import java.util.List;

import org.lldm.xaltipac.data.model.Week;
import org.lldm.xaltipac.service.dto.ActionResourceDTO;
import org.lldm.xaltipac.service.dto.OfferingDetailsOfferingDTO;
import org.lldm.xaltipac.data.model.Offering;
import org.lldm.xaltipac.data.model.OfferingDetails;
import org.lldm.xaltipac.data.model.Profile;
import org.lldm.xaltipac.data.model.UserDetails;

/**
 * 
 * @author Juan Mateo.
 *
 */

public interface OfferingDetailService extends BaseService<OfferingDetails, Integer>{
	public List<OfferingDetails> findByOffering(Offering offering);
	public List<OfferingDetails> findByWeek(Week day);
	public List<OfferingDetails> findByUserDetails(UserDetails userDetails);
	public List<OfferingDetails> findByUserDetailsAndWeek(UserDetails userDetails, Week week);
	public List<OfferingDetails> findByOfferingAndWeek(Offering offering, Week day);
	void saveManyOfferginDetails(Week week, List<OfferingDetailsOfferingDTO> offeringDetailsOfferingList);
	
//	List<OfferingDetails> getOfferingDetailByUserOfferingDay(Offering offering, Days day, UserDetails userDetail);
}
