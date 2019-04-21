package hello.service;

import hello.domain.Master;
import hello.repos.MasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterService {
    @Autowired
    private MasterRepo masterRepo;

    public Iterable<Master> loadMasterByFIO(){
        return masterRepo.findAll();
    }
}
