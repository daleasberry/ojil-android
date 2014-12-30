package com.github.ojil.android;

import com.github.ojil.algorithm.AlgorithmErrorCodes;
import com.github.ojil.core.ErrorCodes;
import com.github.ojil.core.ImageError;


/**
 * This is the class used to create Strings from Error objects when running
 * under Android. The point is that the Android localization support is used so
 * the same approach won't work with J2ME, etc.<br>
 * Usage:<br>
 * 		com.github.ojil.android.Error eAndroid = new com.github.ojil.android.Error(e);<br>
 * 	 	... eAndroid.toString() ...
 * @author webb
 *
 */
public class Error extends ImageError {
	private static final long serialVersionUID = 556419063832149081L;

	private static final String szMessage[][] = new String[ImageError.PACKAGE.COUNT][];
    
    {
        Error.szMessage[ImageError.PACKAGE.CORE] = new String[ErrorCodes.COUNT];
        Error.szMessage[ImageError.PACKAGE.CORE][ErrorCodes.BOUNDS_OUTSIDE_IMAGE] =
            Messages.getString("BOUNDS_OUTSIDE_IMAGE");
        Error.szMessage[ImageError.PACKAGE.CORE][ErrorCodes.ILLEGAL_PARAMETER_VALUE] =
            Messages.getString("ILLEGAL_PARAMETER_VALUE");
        Error.szMessage[ImageError.PACKAGE.CORE][ErrorCodes.IMAGE_MASK_SIZE_MISMATCH] =
            Messages.getString("IMAGE_MASK_SIZE_MISMATCH");
        Error.szMessage[ImageError.PACKAGE.CORE][ErrorCodes.MATH_DIVISION_ZERO] =
            Messages.getString("MATH_DIVISION_ZERO");
        Error.szMessage[ImageError.PACKAGE.CORE][ErrorCodes.MATH_NEGATIVE_SQRT] =
            Messages.getString("MATH_NEGATIVE_SQRT");
        Error.szMessage[ImageError.PACKAGE.CORE][ErrorCodes.MATH_PRODUCT_TOO_LARGE] =
            Messages.getString("MATH_PRODUCT_TOO_LARGE");
        Error.szMessage[ImageError.PACKAGE.CORE][ErrorCodes.MATH_SQUARE_TOO_LARGE] =
            Messages.getString("MATH_SQUARE_TOO_LARGE");
        Error.szMessage[ImageError.PACKAGE.CORE][ErrorCodes.NO_RESULT_AVAILABLE] =
            Messages.getString("PIPELINE_NO_RESULT");
        Error.szMessage[ImageError.PACKAGE.CORE][ErrorCodes.PIPELINE_EMPTY_PUSH] =
            Messages.getString("PIPELINE_EMPTY_PUSH");

        Error.szMessage[ImageError.PACKAGE.ALGORITHM] = new String[AlgorithmErrorCodes.COUNT];
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.CONN_COMP_LABEL_COMPARETO_NULL] =
            Messages.getString("CONN_COMP_LABEL_COMPARETO_NULL");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.CONN_COMP_LABEL_OUT_OF_BOUNDS] =
            Messages.getString("CONN_COMP_LABEL_OUT_OF_BOUNDS");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.INPUT_TERMINATED_EARLY] =
            Messages.getString("INPUT_TERMINATED_EARLY");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.FFT_SIZE_LARGER_THAN_MAX] =
            Messages.getString("FFT_SIZE_LARGER_THAN_MAX");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.FFT_SIZE_NOT_POWER_OF_2] =
            Messages.getString("FFT_SIZE_NOT_POWER_OF_2");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.HEAP_EMPTY] =
            Messages.getString("HEAP_EMPTY");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.HISTOGRAM_LENGTH_NOT_256] =
            Messages.getString("HISTOGRAM_LENGTH_NOT_256");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.ILLEGAL_COLOR_CHOICE] =
            Messages.getString("ILLEGAL_COLOR_CHOICE");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.IMAGE_NOT_COMPLEX32IMAGE] =
            Messages.getString("IMAGE_NOT_COMPLEX32IMAGE");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.IMAGE_NOT_GRAY16IMAGE] =
            Messages.getString("IMAGE_NOT_GRAY16IMAGE");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.IMAGE_NOT_GRAY32IMAGE] =
            Messages.getString("IMAGE_NOT_GRAY32IMAGE");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.IMAGE_NOT_GRAY8IMAGE] =
            Messages.getString("IMAGE_NOT_GRAY8IMAGE");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.IMAGE_NOT_RGBIMAGE] =
            Messages.getString("IMAGE_NOT_RGBIMAGE");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.IMAGE_NOT_SQUARE] =
            Messages.getString("IMAGE_NOT_SQUARE");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.IMAGE_SIZES_DIFFER] =
            Messages.getString("IMAGE_SIZES_DIFFER");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.IMAGE_TOO_SMALL] =
            Messages.getString("IMAGE_TOO_SMALL");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.INPUT_IMAGE_SIZE_NEGATIVE] =
            Messages.getString("INPUT_IMAGE_SIZE_NEGATIVE");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.INPUT_TERMINATED_EARLY] =
            Messages.getString("INPUT_TERMINATED_EARLY");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.IO_EXCEPTION] =
            Messages.getString("IO_EXCEPTION");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.LOOKUP_TABLE_LENGTH_NOT_256] =
            Messages.getString("LOOKUP_TABLE_LENGTH_NOT_256");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.OBJECT_NOT_EXPECTED_TYPE] =
            Messages.getString("OBJECT_NOT_EXPECTED_TYPE");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.OUTPUT_IMAGE_SIZE_NEGATIVE] =
            Messages.getString("OUTPUT_IMAGE_SIZE_NEGATIVE");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.PARAMETER_OUT_OF_RANGE] =
            Messages.getString("PARAMETER_OUT_OF_RANGE");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.PARAMETER_RANGE_NULL_OR_NEGATIVE] =
            Messages.getString("PARAMETER_RANGE_NULL_OR_NEGATIVE");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.PARSE_ERROR] =
            Messages.getString("PARSE_ERROR");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.REDUCE_INPUT_IMAGE_NOT_MULTIPLE_OF_OUTPUT_SIZE] =
            Messages.getString("REDUCE_INPUT_IMAGE_NOT_MULTIPLE_OF_OUTPUT_SIZE");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.SHRINK_OUTPUT_LARGER_THAN_INPUT] =
            Messages.getString("SHRINK_OUTPUT_LARGER_THAN_INPUT");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.STATISTICS_VARIANCE_LESS_THAN_ZERO] =
            Messages.getString("STATISTICS_VARIANCE_LESS_THAN_ZERO");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.STRETCH_OUTPUT_SMALLER_THAN_INPUT] =
            Messages.getString("STRETCH_OUTPUT_SMALLER_THAN_INPUT");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.SUBIMAGE_NO_IMAGE_AVAILABLE] =
            Messages.getString("SUBIMAGE_NO_IMAGE_AVAILABLE");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.THRESHOLD_NEGATIVE] =
            Messages.getString("THRESHOLD_NEGATIVE");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.WARP_END_LEFT_COL_GE_END_RIGHT_COL] =
            Messages.getString("WARP_END_LEFT_COL_GE_END_RIGHT_COL");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.WARP_START_LEFT_COL_GE_START_RIGHT_COL] =
            Messages.getString("WARP_START_LEFT_COL_GE_START_RIGHT_COL");
        Error.szMessage[ImageError.PACKAGE.ALGORITHM][AlgorithmErrorCodes.WARP_START_ROW_GE_END_ROW] =
            Messages.getString("WARP_START_ROW_GE_END_ROW");
    }
    
	public Error(ImageError e) {
		super(e);
	}

    public String getLocalizedMessage() {
        String szResult = null;
        switch (this.getPackage()) {
            case Error.PACKAGE.CORE:
                if (this.getCode() < 0 || this.getCode() >= ErrorCodes.COUNT) {
                    szResult = Messages.getString("Illegal_error_code_core") + 
                            new Integer(this.getCode()).toString();
                 } else {
                    szResult = szMessage[this.getPackage()][this.getCode()];
                }
                break;
            case Error.PACKAGE.ALGORITHM:
                if (this.getCode() < 0 || this.getCode() >= AlgorithmErrorCodes.COUNT) {
                    szResult = Messages.getString("Illegal_error_code_algorithm") + 
                            new Integer(this.getCode()).toString();
                 } else {
                    szResult = szMessage[this.getPackage()][this.getCode()];
                }
                break;
            case ImageError.PACKAGE.J2ME:
                szResult = Messages.getString("Illegal_error_code_j2me") +  " " +
                        new Integer(this.getCode()).toString();
                break;
            default:
                szResult = Messages.getString("Illegal_error_code_package") + " " +
                        new Integer(this.getPackage()).toString() + " " +
                        new Integer(this.getCode()).toString();
                break;
           }
           return szResult + ":  " + parameters();
    }

}
