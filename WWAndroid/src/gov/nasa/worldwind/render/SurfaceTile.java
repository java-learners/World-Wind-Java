/*
 * Copyright (C) 2011 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */
package gov.nasa.worldwind.render;

import gov.nasa.worldwind.geom.*;

/**
 * @author dcollins
 * @version $Id$
 */
public interface SurfaceTile
{
    Sector getSector();

    boolean bind(DrawContext dc);

    void applyInternalTransform(DrawContext dc, Matrix matrix);
}
