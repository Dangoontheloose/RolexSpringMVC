package com.rolex.web.service;

import com.rolex.web.model.Material;
import com.rolex.web.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {
    @Autowired
    MaterialRepository materialRepository;

    public List<Material> getMaterialList() { return materialRepository.findAll(); }

    public void deleteMaterial(Material material) { materialRepository.delete(material);}
    public void deleteMaterialByMaterialID(int materialID) { materialRepository.deleteByMaterialID(materialID);}
    public void updateMaterial(Material material) {
        Material currentMaterial = materialRepository.findByMaterialID(material.getMaterialID());
        if (currentMaterial != null) {
            currentMaterial.setMaterialName(material.getMaterialName());
            materialRepository.save(currentMaterial);
        }
        else{
            materialRepository.insert(material);
        }
    }
}
