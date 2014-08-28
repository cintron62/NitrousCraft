package com.cintron62.nitrouscraft.handler;

import net.minecraft.item.crafting.IRecipe;

import java.util.Comparator;

public class CraftingDeskRecipeSorter implements Comparator
{
    final CraftingDeskHandler craftingDesk;

    public CraftingDeskRecipeSorter(CraftingDeskHandler CraftingDeskHandler) {
        this.craftingDesk = CraftingDeskHandler;
    }

    public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2) {
        return irecipe1 instanceof CraftingDeskShapelessRecipes && irecipe2 instanceof CraftingDeskShapedRecipes ? 1: (irecipe2 instanceof CraftingDeskShapelessRecipes && irecipe1 instanceof CraftingDeskShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
    }

    @Override
    public int compare(Object o1, Object o2) {
        return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
    }
}
