package com.trivago.hotelsearch.search.cloudoperations.casestudy;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE, reason = "Unready")
public class UnreadyException extends RuntimeException {}
