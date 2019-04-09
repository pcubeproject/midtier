package com.pcube.provider.whitelist;

import com.pcube.service.provider.whitelist.TPWhiteList;
import com.pcube.service.provider.whitelist.TRWhiteList;
import com.pcube.service.provider.whitelist.WhiteListService;
import org.springframework.stereotype.Component;

/**
 * Created by kenya on 2019/2/14.
 */
public class WhiteListImpl implements WhiteListService {
    @Override
    public TRWhiteList filter(TPWhiteList tpWhiteList){
        return new TRWhiteList();
    }
}
