package com.team.taskmanagement.service;

import com.team.taskmanagement.dao.InboxDao;
import com.team.taskmanagement.model.Inbox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InboxService {

    @Autowired
    private InboxDao inboxDao;

    public List<Inbox> viewAllemails () {
        return inboxDao.findAll();
    }

}
