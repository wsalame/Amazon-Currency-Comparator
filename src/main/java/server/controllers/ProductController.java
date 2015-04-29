package server.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

  @RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public Map<String, String> getMovie(@PathVariable String name, ModelMap model) {
    Map<String, String> result = new HashMap<String, String>();
    result.put("status", "success");
    result.put("content", "It Works!");

    return result;
  }
}
