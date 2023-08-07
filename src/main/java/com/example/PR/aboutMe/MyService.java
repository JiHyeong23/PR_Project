package com.example.PR.aboutMe;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MyService {
    private final MyRepository myRepository;
    private final MyMapper myMapper;

    public IntroduceDto getMyInfo(Long id) {
        Me me = myRepository.findById(id).get();
        IntroduceDto introduceDto = myMapper.MeToIntroduceDto(me);
        return introduceDto;
    }
}
