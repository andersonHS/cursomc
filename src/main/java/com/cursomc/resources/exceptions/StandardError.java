package com.cursomc.resources.exceptions;

import java.io.Serializable;
import java.time.LocalDateTime;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer status;
	private String msg;
	private LocalDateTime time;

	public StandardError(Integer status, String msg, LocalDateTime time) {
		super();
		this.status = status;
		this.msg = msg;
		this.time = time;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

}
