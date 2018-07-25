package com.igreedy.sparkproject.dao.impl;

import com.igreedy.sparkproject.dao.ITaskDAO;
import com.igreedy.sparkproject.domain.Task;

import junit.framework.TestCase;

/**
 * Created by igreedy on 2018/7/24
 */
public class TaskDAOImplTest extends TestCase {

    public void testFindById() {
        ITaskDAO taskDAO = DAOFactory.getTaskDAO();
        Task task = taskDAO.findById(2);
        System.out.println(task.getTaskName());
    }
}