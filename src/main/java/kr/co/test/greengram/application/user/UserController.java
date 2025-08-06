package kr.co.test.greengram.application.user;

import jakarta.validation.Valid;
import kr.co.test.greengram.config.model.ResultResponse;
import kr.co.test.greengram.config.model.UsersignUpReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import java.nio.channels.MulticastChannel;

@Slf4j
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/sign-up")
    public ResultResponse<?> signUp(@Valid @RequestPart UsersignUpReq req
                                , @RequestPart(required = false) MulticastChannel pic) {
        log.info("req: {}", req);

        return new ResultResponse<>("", 1);
    }

}
