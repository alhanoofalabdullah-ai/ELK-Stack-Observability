package com.alhanoof.uba.service;

import com.alhanoof.uba.dto.UserBehaviorDTO;
import org.springframework.stereotype.Service;

@Service
public class UbaService {

    public UserBehaviorDTO getMetrics() {

        return new UserBehaviorDTO(
                2850,
                15,
                4,
                7,
                "Warning"
        );
    }
}
