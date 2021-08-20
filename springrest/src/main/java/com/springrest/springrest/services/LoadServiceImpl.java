package com.springrest.springrest.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.loadDao;
import com.springrest.springrest.entities.load;

@Service
public class LoadServiceImpl implements LoadService{
	
	@Autowired
	private loadDao lD;

	//List<load> list;
	
	public LoadServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new load(1,"delhi","jaipur","chemicals","canter",1,100.0,"comment","dd-mm-yyyy"));
//		
	}
	
	@Override
	public List<load> getload() {
		return lD.findAll();
	}

	
	@Override
	public load getload1(int shipperid) {
		
//		load l=null;
//		
//		for(load l1:list) {
//			if(l1.getShipperid()==shipperid) {
//				l=l1;
//				break;
//			}
//		}
		return lD.getOne(shipperid);
	}

	@Override
	public load addLoad(load l1) {
		
	//	list.add(l1);
		lD.save(l1);
		return l1;
	}
	
	@Override
	public load updateLoad(load l1) {
		
		
		
//		list.forEach(e -> {
//			if(e.getShipperid()==l1.getShipperid()) {
//				
//				e.setLoadingPoint(e.getLoadingPoint());
//				e.setUnloadingPoint(e.getUnloadingPoint());
//				e.setProductType(e.getProductType());
//				e.setTruckType(e.getTruckType());
//				e.setNoOfTrucks(e.getNoOfTrucks());
//				e.setWeight(e.getWeight());
//				e.setComment(e.getComment());
//				e.setDate(e.getDate());
//				
//			}
//		});
		
		lD.save(l1);
		return l1;
	}

	@Override
	public void deleteLoad(int shipperid) {
	//	list=this.list.parallelStream().filter(e->e.getShipperid()!=shipperid).collect(Collectors.toList());
		
		load l=lD.getOne(shipperid);
		lD.delete(l);
	}

}
