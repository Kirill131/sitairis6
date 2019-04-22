package hello.service;

import hello.domain.Master;
import hello.repos.MasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MasterService {
    @Autowired
    private MasterRepo masterRepo;

    @Transactional
    public List<Master> loadMasterByFIO(int category){
        return  masterRepo.findByCategory(category);
    }

    @Transactional
    public Iterable<Master> loadAllMasters(){
        return masterRepo.findAll();
    }

    @Transactional
    public Master saveMasters(Master masters){
        return masterRepo.save(masters);
    }

    @Transactional
    public void deleteMaster(Master master){
        masterRepo.delete(master);
    }
}
