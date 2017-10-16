package com.hpe.findlover.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "visit_trace")
public class VisitTrace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "interviewee_id")
    private Integer intervieweeId;

    @Column(name = "visit_time")
    private Date visitTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return interviewee_id
     */
    public Integer getIntervieweeId() {
        return intervieweeId;
    }

    /**
     * @param intervieweeId
     */
    public void setIntervieweeId(Integer intervieweeId) {
        this.intervieweeId = intervieweeId;
    }

    /**
     * @return visit_time
     */
    public Date getVisitTime() {
        return visitTime;
    }

    /**
     * @param visitTime
     */
    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }
}