package com.bit_etland.web.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.ImageDTO;
import com.bit_etland.web.proxy.Proxy;

@Service
public class ImageServiceImpl implements ImageService {

	@Override
	public void addImage(ImageDTO img) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ImageDTO> imageList(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ImageDTO> searchImage(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countImage(Proxy pxy) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existImage(ImageDTO img) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyImage(ImageDTO img) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeImage(ImageDTO img) {
		// TODO Auto-generated method stub
		
	}

}
