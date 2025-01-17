package id.my.hendisantika.elasticapm.task;

import co.elastic.apm.api.CaptureSpan;
import co.elastic.apm.api.CaptureTransaction;
import id.my.hendisantika.elasticapm.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-elastic-apm
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/01/25
 * Time: 08.24
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PrintUsersTask {

    private final UserRepository userRepository;

    @Scheduled(fixedDelayString = "5000")
    public void execute() {
        log.info("run scheduled test");
        doExecute();
    }

    @CaptureTransaction(type = "Task", value = "PrintUsers")
    private void doExecute() {
        userRepository.findAll().forEach(user -> log.debug(user.getEmail()));
        sleep();
    }

    @SuppressWarnings("checkstyle:MagicNumber")
    @CaptureSpan("someCustomOperation")
    private void sleep() {
        try {
            Random random = new Random();
            int milis = random.nextInt(120 - 20 + 1) + 20;
            Thread.sleep(milis);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }
}
