package com.codesquad.todo5.controller;

import com.codesquad.todo5.domain.ActionItem;
import com.codesquad.todo5.domain.ActivityItem;
import com.codesquad.todo5.domain.UserItem;
import com.codesquad.todo5.dto.ActivityItemDto;
import com.codesquad.todo5.response.ApiResponse;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ActivityController {
  private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);

  @GetMapping("/member/{num}/activity")
  public ResponseEntity<ApiResponse> showUserActivity(@RequestParam String membernum) {

    return new ResponseEntity<>(response, HttpStatus.OK);
  }
}
