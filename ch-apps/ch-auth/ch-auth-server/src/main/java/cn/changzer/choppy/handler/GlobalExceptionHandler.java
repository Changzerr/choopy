package cn.changzer.choppy.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lingqu
 * @date 2022/10/26
 * @apiNote
 */

@ControllerAdvice(annotations = {RestController.class, Controller.class})
@ResponseBody
public class GlobalExceptionHandler extends DefaultGlobalExceptionHandler {
}
