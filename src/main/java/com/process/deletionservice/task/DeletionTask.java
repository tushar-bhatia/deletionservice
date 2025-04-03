package com.process.deletionservice.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DeletionTask {

    @Autowired
    @Qualifier("databaseTemplate")
    JdbcTemplate databaseTemplate;

    /***
     * This is the method which runs every specified minute.
     * It Check if there is any data eligible for deletion from archive tables.
     */
    @Scheduled(fixedDelayString = "${delete.delay.interval}")
    public void deleteData() {
        log.info("Starting Deletion Process");

        log.info("Deletion Process Completed");
    }
}
